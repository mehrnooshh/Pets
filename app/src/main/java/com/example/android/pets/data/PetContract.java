package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Mehrnoosh on 2/12/2018.
 */

public final class PetContract {

    private PetContract() {
    }
    public static final class PetEntry implements BaseColumns{
        public static final String TABLE_NAME = "pets";
        public static final String _ID = "_id";
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /** Possible values for the gender of pets
         */
        public static final int GENDER_MALE = 0 ;
        public static final int GENDER_FEMALE = 1;
        public static final int GENDER_UNKNOWN = 2;

    }
}
