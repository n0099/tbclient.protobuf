package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
/* loaded from: classes2.dex */
public final class UserFollowLive extends Message {
    public static final List<AlaLiveInfo> DEFAULT_USER_FOLLOW_LIVE = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AlaLiveInfo> user_follow_live;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserFollowLive> {
        public List<AlaLiveInfo> user_follow_live;

        public Builder() {
        }

        public Builder(UserFollowLive userFollowLive) {
            super(userFollowLive);
            if (userFollowLive == null) {
                return;
            }
            this.user_follow_live = Message.copyOf(userFollowLive.user_follow_live);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserFollowLive build(boolean z) {
            return new UserFollowLive(this, z);
        }
    }

    public UserFollowLive(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<AlaLiveInfo> list = builder.user_follow_live;
            if (list == null) {
                this.user_follow_live = DEFAULT_USER_FOLLOW_LIVE;
                return;
            } else {
                this.user_follow_live = Message.immutableCopyOf(list);
                return;
            }
        }
        this.user_follow_live = Message.immutableCopyOf(builder.user_follow_live);
    }
}
