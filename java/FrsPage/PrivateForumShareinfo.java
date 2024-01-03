package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PrivateForumShareinfo extends Message {
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final String DEFAULT_MANAGER_PORTRAIT = "";
    public static final String DEFAULT_MANAGER_USER_NAME = "";
    public static final String DEFAULT_SHARE_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String manager_portrait;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String manager_user_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String share_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PrivateForumShareinfo> {
        public Integer create_time;
        public String manager_portrait;
        public String manager_user_name;
        public String share_url;

        public Builder() {
        }

        public Builder(PrivateForumShareinfo privateForumShareinfo) {
            super(privateForumShareinfo);
            if (privateForumShareinfo == null) {
                return;
            }
            this.create_time = privateForumShareinfo.create_time;
            this.share_url = privateForumShareinfo.share_url;
            this.manager_user_name = privateForumShareinfo.manager_user_name;
            this.manager_portrait = privateForumShareinfo.manager_portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivateForumShareinfo build(boolean z) {
            return new PrivateForumShareinfo(this, z);
        }
    }

    public PrivateForumShareinfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            String str = builder.share_url;
            if (str == null) {
                this.share_url = "";
            } else {
                this.share_url = str;
            }
            String str2 = builder.manager_user_name;
            if (str2 == null) {
                this.manager_user_name = "";
            } else {
                this.manager_user_name = str2;
            }
            String str3 = builder.manager_portrait;
            if (str3 == null) {
                this.manager_portrait = "";
                return;
            } else {
                this.manager_portrait = str3;
                return;
            }
        }
        this.create_time = builder.create_time;
        this.share_url = builder.share_url;
        this.manager_user_name = builder.manager_user_name;
        this.manager_portrait = builder.manager_portrait;
    }
}
