# AndroText #

AndroText is a model-driven development tool for the Android Platform. 
Provides rapid prototyping development process with the AndroText language (based on Xtext framework). 
Provides a fully automated generator, that generates an entire, simple Android application from scratch based on the models of the Android components.
Integrates with Eclipse and comes with IDE support (content assist, error checking validation).

# RoadMap #

RoadMap Date: 2012. 10. 07.

* Features
 * Simple Activity design
 * Simple UI design
 * Simple View and Layout attributes
 * Simple navigation with widgets onClick, and onListItemClick, and intent calls (explicit and implicit)
 * Activity Menu and ContextMenu support
 * Preferences API support
 * Simple Data-layer design (Entity Model, ContentProvider)
 * The tool generates Activity classes, methods, simple logic. 
 * The tool generates UI layout files (some selectors), Entity classes.
 * The tool generates Generate ContentProvider/DataBaseManager from entity models (single table handling, joins not supported)
* Future plans
 * Use Google Guice, Roboguice for injecting Views and resources into Activity classes.
 * Write validation constraints. Use [EMF INCQuery](http://viatra.inf.mit.bme.hu/incquery/base#Overview)
 
# Installation #

1. Get Eclipse with Xtext 2.3.1
2. Get AndroText from Github as Zip or Clone the repository
3. Start Eclipse and import all project from the *tooling* directory into your workspace
4. IMPORTANT: generate the language with the workflow file in the *.lang project.
5. Start a Runtime Eclipse with the newly imported plugins.
6. Create a simple Java project (later a AndroText project), and create *.androtext files (Content assist helps a lot).
7. See the example project in the *examples* folder.

## License ##

All files of AndroText project are licensed under the [EPL](http://www.eclipse.org/legal/epl-v10.html).

## Contributions ##

 * Current contributors
  * Czotter Mark ([CMark](http://github.com/CMark))

If you want to contribute:

1. Look at the [issues](https://github.com/CMark/androtext/issues).
2. Fork a repository from AndroText and do your changes.
3. Send a pull request.
