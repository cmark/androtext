package hu.bme.mit.androtext.examples.gen;

import org.anddev.andengine.entity.scene.menu.MenuScene;
import org.anddev.andengine.entity.scene.menu.item.IMenuItem;

import android.os.Bundle;
import android.view.KeyEvent;

public class MenuExampleActivity extends AbstractMenuExampleActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public boolean onKeyDown(final int pKeyCode, final KeyEvent pEvent) {
		if (pKeyCode == KeyEvent.KEYCODE_MENU
				&& pEvent.getAction() == KeyEvent.ACTION_DOWN) {
			if (this.mScene.hasChildScene()) {
				/* Remove the menu and reset it. */
				this.mMenuSceneSimpleMenu.back();
			} else {
				/* Attach the menu. */
				this.mScene.setChildScene(this.mMenuSceneSimpleMenu, false,
						true, true);
			}
			return true;
		} else {
			return super.onKeyDown(pKeyCode, pEvent);
		}
	}

	@Override
	public boolean onMenuItemClicked(MenuScene pMenuScene, IMenuItem pMenuItem,
			float pMenuItemLocalX, float pMenuItemLocalY) {
		switch (pMenuItem.getID()) {
		case RESET:
			this.mScene.reset();
			this.mScene.clearChildScene();
			this.mMenuSceneSimpleMenu.reset();
			return true;
		case QUIT:
			this.finish();
			return true;
		default:
			return false;
		}
	}

}
