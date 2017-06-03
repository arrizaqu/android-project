# Android Development I (PART I) 

##HELLO WORLD 
	* First Create Android Project

## CONFIGURE BUTTERKNIFE
### Add Gradle Dependency 
#### Add build.gradle (Modul app)
	* compile 'com.android.support:design:25.3.1'
	* compile 'com.jakewharton:butterknife:8.6.0'
	* annotationProcessor 'com.jakewharton:butterknife-compiler:8.6.0'
			
#### Add build.gradle (Project app-name)
	* apply plugin: 'com.jakewharton.butterknife'
	* classpath 'com.jakewharton:butterknife-gradle-plugin:8.6.0'
	
#### Check Update How to use :  
	* http://jakewharton.github.io/butterknife/
	* https://github.com/JakeWharton/butterknife
	

## CREATE FRAGMENT VIEWPAGER
### ViewPager File XML (View)
#### Fragment_about_us.xml
#### Fragment_rush.xml 
#### fragment_meet_a_brow.xml
		
### FRAGMENT CLASS 
#### CREATE Class Fragment : 
			* /package_name/activities/main_activity.java
			* /package_name/fragments/AboutUs.java
			* /package_name/fragments/Rush
			* /package_name/fragments/MeetABrow
			
	* MainActivityViewPager extends FragmentStatePagerAdapter
		* override : 
			* getItem
			* getCount
			* getPageTitle
			
	* Connect MainActivity with MainActivityViewPager 
	* Binding MainActivity with ButterKnife
	
## Refference : 
	* http://jakewharton.github.io/butterknife/
	* https://github.com/JakeWharton/butterknife
	