package com.algorepublic.cityhistory.cityhistory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by waqas on 6/18/15.
 */
public class PersonalityFragment extends BaseFragment {

    public static PersonalityFragment newInstance(String id) {
        PersonalityFragment fragment = new PersonalityFragment();

        return fragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.personality_fragment, container, false);
//        aq = new AQuery(getActivity(), view);
//        CityView = (ListView) view.findViewById(R.id.city_details);
//        base = ((BaseClass) getActivity().getApplicationContext());
//        obj = new CityDetailService(getActivity().getApplicationContext());
//        obj.CityDetails(true, new CallBack(this, "CityDetails"));

        return view;
    }
}
