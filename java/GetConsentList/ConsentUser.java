package tbclient.GetConsentList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ConsentUser extends Message {
    public static final String DEFAULT_AUTHOR_NAME = "";
    public static final String DEFAULT_AUTHOR_NAME_SHOW = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NAME_SHOW = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String author_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String author_name_show;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long gid;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String user_name_show;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_AUTHOR_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Long DEFAULT_GID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ConsentUser> {
        public Long author_id;
        public String author_name;
        public String author_name_show;
        public Integer create_time;
        public Long gid;
        public String portrait;
        public Long post_id;
        public Long thread_id;
        public Long user_id;
        public String user_name;
        public String user_name_show;

        public Builder() {
        }

        public Builder(ConsentUser consentUser) {
            super(consentUser);
            if (consentUser == null) {
                return;
            }
            this.user_id = consentUser.user_id;
            this.user_name = consentUser.user_name;
            this.author_id = consentUser.author_id;
            this.author_name = consentUser.author_name;
            this.portrait = consentUser.portrait;
            this.thread_id = consentUser.thread_id;
            this.post_id = consentUser.post_id;
            this.create_time = consentUser.create_time;
            this.gid = consentUser.gid;
            this.author_name_show = consentUser.author_name_show;
            this.user_name_show = consentUser.user_name_show;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConsentUser build(boolean z) {
            return new ConsentUser(this, z);
        }
    }

    public ConsentUser(Builder builder, boolean z) {
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
            Long l2 = builder.author_id;
            if (l2 == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l2;
            }
            String str2 = builder.author_name;
            if (str2 == null) {
                this.author_name = "";
            } else {
                this.author_name = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            Long l3 = builder.thread_id;
            if (l3 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l3;
            }
            Long l4 = builder.post_id;
            if (l4 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l4;
            }
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            Long l5 = builder.gid;
            if (l5 == null) {
                this.gid = DEFAULT_GID;
            } else {
                this.gid = l5;
            }
            String str4 = builder.author_name_show;
            if (str4 == null) {
                this.author_name_show = "";
            } else {
                this.author_name_show = str4;
            }
            String str5 = builder.user_name_show;
            if (str5 == null) {
                this.user_name_show = "";
                return;
            } else {
                this.user_name_show = str5;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.author_id = builder.author_id;
        this.author_name = builder.author_name;
        this.portrait = builder.portrait;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.create_time = builder.create_time;
        this.gid = builder.gid;
        this.author_name_show = builder.author_name_show;
        this.user_name_show = builder.user_name_show;
    }
}
