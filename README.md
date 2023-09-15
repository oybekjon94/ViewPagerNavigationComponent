# Viewpager2
Viewpager2 is an updated or enhanced version of Viewpager released by Google on 7th Feb 2009. It comes with a variety of new features. The most important feature of viewpager2 that is not present in Viewpager is, the Recyclerview which makes Viewpager2 more efficient than Viewpager. By using the Recyclerview, we can add items dynamically. If you know how to implement a RecyclerView then you can easily implement ViewPager2.

## Features of ViewPager2
It uses Recyclerview implicitly and is the most important feature.
Supports Right to Left layout.
Supports Vertical orientation.
CompositePageTransformer is introduced to combine multiple page  transformers
notifyDataSetChanged() fully functional.
## More About ViewPager2
![image](https://github.com/oybekjon94/ViewPagerNavigationComponent/assets/91370134/3d6f8f61-37a5-4edf-9ff5-7b2c3583bbd7)
### View Group:
Just like ViewPager the ViewPager2 extends from the ViewGroup. A ViewGroup is a view that can contain other views. It is a subclass of the View class. It is the base class for the layouts, like LinearLayout, RelativeLayout, etc.
### LayoutManager: 
The LayoutManager is the same that you have been used in RecyclerView. The LayoutManager is managed by the Viewpager and it manages the views and is used to set the orientation of the ViewPager2.
### RecyclerView: 
The Recyclerview is used to handle to components provided to it. It will show the data to the user that is assigned to it and makes ViewPager2 more efficient.  
## Page Change Callback Methods
### onPageScrolled(): 
This method is triggered when there is any scrolling activity for the current page.
### onPageSelected(): 
triggered when you select a new page.
### onPageScrollStateChanged(): 
triggered when there is scroll state will be changed.
