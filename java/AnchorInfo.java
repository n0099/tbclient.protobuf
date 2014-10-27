package tbclient;

import com.baidu.tbadk.coreExtra.service.DealIntentService;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AnchorInfo extends Message {
    public static final String DEFAULT_AUTHOR_NAME = "";
    public static final String DEFAULT_FORUMNAME = "";
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PUBLISHERNAME = "";
    public static final String DEFAULT_PUBLISHERPORTRAIT = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer author_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String author_name;
    @ProtoField(tag = DealIntentService.CLASS_TYPE_GROUP_EVENT, type = Message.Datatype.STRING)
    public final String forumName;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer group_id;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer likers;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer listeners;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer publisherId;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String publisherName;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String publisherPortrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer start_time;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer status;
    public static final Integer DEFAULT_START_TIME = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_AUTHOR_ID = 0;
    public static final Integer DEFAULT_LISTENERS = 0;
    public static final Integer DEFAULT_LIKERS = 0;
    public static final Integer DEFAULT_GROUP_ID = 0;
    public static final Integer DEFAULT_PUBLISHERID = 0;

    /* synthetic */ AnchorInfo(Builder builder, boolean z, AnchorInfo anchorInfo) {
        this(builder, z);
    }

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
                return;
            } else {
                this.forumName = builder.forumName;
                return;
            }
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
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<AnchorInfo> {
        public Integer author_id;
        public String author_name;
        public String forumName;
        public Integer group_id;
        public String intro;
        public Integer likers;
        public Integer listeners;
        public String name;
        public String portrait;
        public Integer publisherId;
        public String publisherName;
        public String publisherPortrait;
        public Integer start_time;
        public Integer status;

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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AnchorInfo build(boolean z) {
            return new AnchorInfo(this, z, null);
        }
    }
}
