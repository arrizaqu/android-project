# Android Development I (PART I) 

## HELLO WORLD 
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
#### 1. fragment_about_us.xml
	<?xml version="1.0" encoding="utf-8"?>
	<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
		android:orientation="vertical" android:layout_width="match_parent"
		android:layout_height="match_parent"
		android:gravity="center"
		>

		<TextView
			android:id="@+id/about_us"
			android:text="About Us"
			android:layout_width="wrap_content"
			android:textSize="32dp"
			android:layout_height="wrap_content" />
	</LinearLayout>
	
#### 2. Fragment_rush.xml 
	<?xml version="1.0" encoding="utf-8"?>
	<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
		android:orientation="vertical" android:layout_width="match_parent"
		android:layout_height="match_parent"
		android:gravity="center"
		>

		<TextView
			android:id="@+id/rush"
			android:text="rush"
			android:layout_width="wrap_content"
			android:textSize="32dp"
			android:layout_height="wrap_content" />
	</LinearLayout>
	
#### 3. fragment_meet_a_brow.xml
	<?xml version="1.0" encoding="utf-8"?>
	<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
		android:orientation="vertical" android:layout_width="match_parent"
		android:layout_height="match_parent"
		android:gravity="center"
		>

		<TextView
			android:id="@+id/meet_a_brow"
			android:text="meet a brow"
			android:layout_width="wrap_content"
			android:textSize="32dp"
			android:layout_height="wrap_content" />
	</LinearLayout>
		
### FRAGMENT CLASS 
#### A. CREATE Class Fragment : 
##### 1. fragments.AboutUs.java
	public class FragmentAboutUs extends Fragment {

		public static FragmentAboutUs newInstance(){
			return new FragmentAboutUs();
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_about_us, container, false);
			return rootView;
		}
	}

##### 2. fragments.Rush.java
	public class FragmentRush extends Fragment {

		public static FragmentRush newInstance(){
			return new FragmentRush();
		}
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_rush, container, false);
			return rootView;
		}
	}
	
##### 3. fragments.MeetABrow.java
	public class MeetABrow extends Fragment{
		public static MeetABrow newInstance(){
			return new MeetABrow();
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_meet_a_brow, container, false);
			return rootView;
		}
	}
			
#### B. MainActivityViewPager
##### File : views.MainActivityViewPagerAdapter.java
	public class MainActivityViewPagerAdapter extends FragmentStatePagerAdapter {
		public MainActivityViewPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {

			Fragment fragmentViewPager;
			switch (position){
				case 0 :
					fragmentViewPager = FragmentAboutUs.newInstance();
					break;
				case 1 :
					fragmentViewPager = FragmentRush.newInstance();
					break;
				case 2 :
					fragmentViewPager = MeetABrow.newInstance();
					break;
				default :
					fragmentViewPager = null;
			}

			return fragmentViewPager;
		}

		@Override
		public int getCount() {
			return 3;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			CharSequence title;
			switch(position){
				case 0 :
					title = "About Us";
					break;
				case 1 :
					title = "Rush";
					break;
				case 2:
					title = "Meet A Brow";
					break;
				default :
					title = null;
			}

			return title;
		}
	}

			
#### C. Connect MainActivity with MainActivityViewPager 
##### File : activity.MainActivity.java 
	public class MainActivity extends AppCompatActivity {
	   // @Bind
		@BindView(R.id.activity_main_viewPager)
		ViewPager mainViewPager;

		@BindView(R.id.activity_main_tab_layout)
		TabLayout tabLayout;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			ButterKnife.bind(this);
			MainActivityViewPagerAdapter adapter = new MainActivityViewPagerAdapter(getSupportFragmentManager());
			mainViewPager.setAdapter(adapter);
			tabLayout.setupWithViewPager(mainViewPager);
		}
	}
	
## Refference : 
	* http://jakewharton.github.io/butterknife/
	* https://github.com/JakeWharton/butterknife
	