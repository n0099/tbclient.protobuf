package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AnchorInfo extends Message {
    public static final String DEFAULT_AUTHOR_NAME = "";
    public static final String DEFAULT_FORUMNAME = "";
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_LABEL_NAME = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PUBLISHERNAME = "";
    public static final String DEFAULT_PUBLISHERPORTRAIT = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String author_name;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String forumName;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer from_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long group_id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_vip;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer label_id;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String label_name;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer likers;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer listeners;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 13, type = Message.Datatype.INT64)
    public final Long publisherId;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String publisherName;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String publisherPortrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer start_time;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 20)
    public final ZhiBoInfoTW twzhibo_info;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_START_TIME = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_AUTHOR_ID = 0L;
    public static final Integer DEFAULT_LISTENERS = 0;
    public static final Integer DEFAULT_LIKERS = 0;
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final Long DEFAULT_PUBLISHERID = 0L;
    public static final Integer DEFAULT_FROM_TYPE = 0;
    public static final Integer DEFAULT_IS_VIP = 0;
    public static final Integer DEFAULT_LABEL_ID = 0;
    public static final Integer DEFAULT_TYPE = 0;

    private AnchorInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.start_time == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = builder.start_time;
            }
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = builder.status;
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
            if (builder.listeners == null) {
                this.listeners = DEFAULT_LISTENERS;
            } else {
                this.listeners = builder.listeners;
            }
            if (builder.likers == null) {
                this.likers = DEFAULT_LIKERS;
            } else {
                this.likers = builder.likers;
            }
            if (builder.group_id == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = builder.group_id;
            }
            if (builder.intro == null) {
                this.intro = "";
            } else {
                this.intro = builder.intro;
            }
            if (builder.publisherPortrait == null) {
                this.publisherPortrait = "";
            } else {
                this.publisherPortrait = builder.publisherPortrait;
            }
            if (builder.publisherName == null) {
                this.publisherName = "";
            } else {
                this.publisherName = builder.publisherName;
            }
            if (builder.publisherId == null) {
                this.publisherId = DEFAULT_PUBLISHERID;
            } else {
                this.publisherId = builder.publisherId;
            }
            if (builder.forumName == null) {
                this.forumName = "";
            } else {
                this.forumName = builder.forumName;
            }
            if (builder.from_type == null) {
                this.from_type = DEFAULT_FROM_TYPE;
            } else {
                this.from_type = builder.from_type;
            }
            if (builder.is_vip == null) {
                this.is_vip = DEFAULT_IS_VIP;
            } else {
                this.is_vip = builder.is_vip;
            }
            if (builder.label_id == null) {
                this.label_id = DEFAULT_LABEL_ID;
            } else {
                this.label_id = builder.label_id;
            }
            if (builder.label_name == null) {
                this.label_name = "";
            } else {
                this.label_name = builder.label_name;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            this.twzhibo_info = builder.twzhibo_info;
            return;
        }
        this.portrait = builder.portrait;
        this.name = builder.name;
        this.start_time = builder.start_time;
        this.status = builder.status;
        this.author_id = builder.author_id;
        this.author_name = builder.author_name;
        this.listeners = builder.listeners;
        this.likers = builder.likers;
        this.group_id = builder.group_id;
        this.intro = builder.intro;
        this.publisherPortrait = builder.publisherPortrait;
        this.publisherName = builder.publisherName;
        this.publisherId = builder.publisherId;
        this.forumName = builder.forumName;
        this.from_type = builder.from_type;
        this.is_vip = builder.is_vip;
        this.label_id = builder.label_id;
        this.label_name = builder.label_name;
        this.type = builder.type;
        this.twzhibo_info = builder.twzhibo_info;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AnchorInfo> {
        public Long author_id;
        public String author_name;
        public String forumName;
        public Integer from_type;
        public Long group_id;
        public String intro;
        public Integer is_vip;
        public Integer label_id;
        public String label_name;
        public Integer likers;
        public Integer listeners;
        public String name;
        public String portrait;
        public Long publisherId;
        public String publisherName;
        public String publisherPortrait;
        public Integer start_time;
        public Integer status;
        public ZhiBoInfoTW twzhibo_info;
        public Integer type;

        public Builder() {
        }

        public Builder(AnchorInfo anchorInfo) {
            super(anchorInfo);
            if (anchorInfo != null) {
                this.portrait = anchorInfo.portrait;
                this.name = anchorInfo.name;
                this.start_time = anchorInfo.start_time;
                this.status = anchorInfo.status;
                this.author_id = anchorInfo.author_id;
                this.author_name = anchorInfo.author_name;
                this.listeners = anchorInfo.listeners;
                this.likers = anchorInfo.likers;
                this.group_id = anchorInfo.group_id;
                this.intro = anchorInfo.intro;
                this.publisherPortrait = anchorInfo.publisherPortrait;
                this.publisherName = anchorInfo.publisherName;
                this.publisherId = anchorInfo.publisherId;
                this.forumName = anchorInfo.forumName;
                this.from_type = anchorInfo.from_type;
                this.is_vip = anchorInfo.is_vip;
                this.label_id = anchorInfo.label_id;
                this.label_name = anchorInfo.label_name;
                this.type = anchorInfo.type;
                this.twzhibo_info = anchorInfo.twzhibo_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AnchorInfo build(boolean z) {
            return new AnchorInfo(this, z);
        }
    }
}
