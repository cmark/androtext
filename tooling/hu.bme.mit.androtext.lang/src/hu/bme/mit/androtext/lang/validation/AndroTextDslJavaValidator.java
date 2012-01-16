package hu.bme.mit.androtext.lang.validation;

import hu.bme.mit.androtext.lang.androTextDsl.AndroGameGui;
import hu.bme.mit.androtext.lang.androTextDsl.AndroTextDslPackage;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Fixture;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;
import hu.bme.mit.androtext.lang.androTextDsl.Joint;
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene;

import org.eclipse.xtext.validation.Check;

/**
 * <p>
 * Simple validation rules for AndroGame part of the DSL.
 * </p>
 * <p>
 * <i>Note: Much more is coming later, and not just for the AndroGame part.<i>
 * </p>
 * 
 * @author Mark Czotter
 * 
 */
public class AndroTextDslJavaValidator extends
		AbstractAndroTextDslJavaValidator {

	@Check
	public void checkCameraSizeExistence(BaseGameActivity activity) {
		if (activity.getSize() == null) {
			warning(activity.getName()
					+ " not defines camera setting. Default is 720x480!",
					AndroTextDslPackage.eINSTANCE.getBaseGameActivity_Size());
		}
	}

	@Check
	public void checkSceneExistence(BaseGameActivity activity) {
		if (activity.getScene() == null) {
			error(activity.getName() + " must define a reference to a scene!",
					AndroTextDslPackage.eINSTANCE.getBaseGameActivity_Scene());
		}
	}

	@Check
	public void checkOrientationExistence(BaseGameActivity activity) {
		System.out.println(activity.getOrientation());
		if (activity.getOrientation() == null) {
			warning(activity.getName()
					+ " not defines orientation setting. Default is LANDSCAPE!",
					AndroTextDslPackage.eINSTANCE
							.getBaseGameActivity_Orientation());
		}
	}

	@Check
	public void checkAndroGameGuiEmptiness(AndroGameGui gui) {
		if (gui.getGameElements() != null && gui.getGameElements().isEmpty()) {
			warning(gui.getName() + " must define some component.",
					AndroTextDslPackage.eINSTANCE
							.getAndroGameGui_GameElements());
		}
	}

	@Check
	public void checkJointBodies(Joint joint) {
		if (joint.getFirst() != null && joint.getSecond() != null) {
			if (joint.getFirst().equals(joint.getSecond())) {
				error(joint.getName()
						+ " must be defined between different bodies!",
						AndroTextDslPackage.eINSTANCE.getJoint_First());
			}
		}
	}

	@Check
	public void checkFrictionRange(Fixture fixture) {
		if (fixture.getFriction() > 1.0f) {
			error("Friction of " + fixture.getName()
					+ " must be lower or equal than one!",
					AndroTextDslPackage.eINSTANCE.getFixture_Friction());
		}
	}

	@Check
	public void checkRestitutionRange(Fixture fixture) {
		if (fixture.getRestitution() > 1.0f) {
			error("Restitution of " + fixture.getName()
					+ " must be lower or equal than one!",
					AndroTextDslPackage.eINSTANCE.getFixture_Restitution());
		}
	}

	@Check
	public void checkMenuSceneEmptiness(MenuScene menu) {
		if (menu.getMenuItems() != null && menu.getMenuItems().isEmpty()) {
			error(menu.getName() + " must define some menuitem!",
					AndroTextDslPackage.eINSTANCE.getMenuScene_MenuItems());
		}
	}

	@Check
	public void checkGameEntityHasName(GameEntity gameEntity) {
		if (gameEntity.getName() == null) {
			warning("Name required for linking!",
					AndroTextDslPackage.eINSTANCE.getGameEntity_Name());
		}
	}

}
