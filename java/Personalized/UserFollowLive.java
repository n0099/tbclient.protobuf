package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
/* loaded from: classes.dex */
public final class UserFollowLive extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer _switch;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AlaLiveInfo> user_follow_live;
    public static final List<AlaLiveInfo> DEFAULT_USER_FOLLOW_LIVE = Collections.emptyList();
    public static final Integer DEFAULT_SWITCH = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<UserFollowLive> {
        public Integer _switch;
        public List<AlaLiveInfo> user_follow_live;

        public Builder() {
        }

        public Builder(UserFollowLive userFollowLive) {
            super(userFollowLive);
            if (userFollowLive == null) {
                return;
            }
            this.user_follow_live = Message.copyOf(userFollowLive.user_follow_live);
            this._switch = userFollowLive._switch;
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
            } else {
                this.user_follow_live = Message.immutableCopyOf(list);
            }
            Integer num = builder._switch;
            if (num == null) {
                this._switch = DEFAULT_SWITCH;
                return;
            } else {
                this._switch = num;
                return;
            }
        }
        this.user_follow_live = Message.immutableCopyOf(builder.user_follow_live);
        this._switch = builder._switch;
    }
}
