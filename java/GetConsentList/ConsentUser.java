package tbclient.GetConsentList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
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

    private ConsentUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.author_id == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = builder.author_id;
            }
            if (builder.author_name == null) {
                this.author_name = "";
            } else {
                this.author_name = builder.author_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = builder.post_id;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.gid == null) {
                this.gid = DEFAULT_GID;
            } else {
                this.gid = builder.gid;
            }
            if (builder.author_name_show == null) {
                this.author_name_show = "";
            } else {
                this.author_name_show = builder.author_name_show;
            }
            if (builder.user_name_show == null) {
                this.user_name_show = "";
                return;
            } else {
                this.user_name_show = builder.user_name_show;
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

    /* loaded from: classes21.dex */
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
            if (consentUser != null) {
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
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConsentUser build(boolean z) {
            return new ConsentUser(this, z);
        }
    }
}
