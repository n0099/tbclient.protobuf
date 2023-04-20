package tbclient.GetFollowUserLive;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class StoryUserInfo extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NICKNAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long live_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer live_status;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_nickname;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Integer DEFAULT_LIVE_STATUS = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<StoryUserInfo> {
        public Long live_id;
        public Integer live_status;
        public String portrait;
        public Long user_id;
        public String user_name;
        public String user_nickname;

        public Builder() {
        }

        public Builder(StoryUserInfo storyUserInfo) {
            super(storyUserInfo);
            if (storyUserInfo == null) {
                return;
            }
            this.user_id = storyUserInfo.user_id;
            this.user_name = storyUserInfo.user_name;
            this.user_nickname = storyUserInfo.user_nickname;
            this.live_id = storyUserInfo.live_id;
            this.live_status = storyUserInfo.live_status;
            this.portrait = storyUserInfo.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StoryUserInfo build(boolean z) {
            return new StoryUserInfo(this, z);
        }
    }

    public StoryUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.user_nickname;
            if (str2 == null) {
                this.user_nickname = "";
            } else {
                this.user_nickname = str2;
            }
            Long l2 = builder.live_id;
            if (l2 == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l2;
            }
            Integer num = builder.live_status;
            if (num == null) {
                this.live_status = DEFAULT_LIVE_STATUS;
            } else {
                this.live_status = num;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str3;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.user_nickname = builder.user_nickname;
        this.live_id = builder.live_id;
        this.live_status = builder.live_status;
        this.portrait = builder.portrait;
    }
}
