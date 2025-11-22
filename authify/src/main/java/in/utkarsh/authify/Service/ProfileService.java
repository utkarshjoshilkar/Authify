package in.utkarsh.authify.Service;

import in.utkarsh.authify.io.ProfileRequest;
import in.utkarsh.authify.io.ProfileResponse;
import org.springframework.stereotype.Service;

@Service
public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest request);
}
