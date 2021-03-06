package game.gui;

public class FilterManager {

	public static final int MALE_ONLY = 0, FEMALE_ONLY = 1, ALL_GENDERS = 2, ADHD_ONLY = 3,
			ALL_DISORDERS = 5;
	public static final float DEFAULT_AGE_LOWER_BOUND = .1f, DEFAULT_AGE_UPPER_BOUND = 120;

	private float[] ageRange;
	private int genderFilter;
	private int disorderFilter;

	public FilterManager() {
		ageRange = new float[] { DEFAULT_AGE_LOWER_BOUND, DEFAULT_AGE_UPPER_BOUND };
		genderFilter=ALL_GENDERS;
		disorderFilter=ALL_DISORDERS;
	}

	public void filterAge(float lower, float upper) {
		if (lower > DEFAULT_AGE_LOWER_BOUND && upper < DEFAULT_AGE_UPPER_BOUND) {
			ageRange[0] = lower;
			ageRange[1] = upper;
		}
	}

	public void filter(int filter) {
		switch (filter) {
		case MALE_ONLY:
			genderFilter = MALE_ONLY;
			break;
		case FEMALE_ONLY:
			genderFilter = FEMALE_ONLY;
			break;
		case ALL_GENDERS:
			genderFilter = ALL_GENDERS;
			break;
		case ADHD_ONLY:
			disorderFilter = ADHD_ONLY;
		case ALL_DISORDERS:
			disorderFilter = ALL_DISORDERS;
			break;
		}
	}

	public float[] getAgeRange() {
		return ageRange;
	}
	
	public int genderFilter() {
		return genderFilter;
	}
	
	public int disorderFilter() {
		return disorderFilter;
	}
	
}
