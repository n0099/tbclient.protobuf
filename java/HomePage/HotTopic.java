package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class HotTopic extends Message {
    public static final String DEFAULT_BANNER_TOPIC_NAME = "";
    public static final String DEFAULT_BANNER_TOPIC_PIC = "";
    public static final String DEFAULT_MORE_LINK = "";
    public static final String DEFAULT_MORE_TEXT = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long banner_topic_discuss_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long banner_topic_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String banner_topic_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String banner_topic_pic;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<HotTopicItem> items;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long mid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String more_link;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String more_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_MID = 0L;
    public static final Long DEFAULT_BANNER_TOPIC_ID = 0L;
    public static final Long DEFAULT_BANNER_TOPIC_DISCUSS_NUM = 0L;
    public static final List<HotTopicItem> DEFAULT_ITEMS = Collections.emptyList();

    /* synthetic */ HotTopic(Builder builder, boolean z, HotTopic hotTopic) {
        this(builder, z);
    }

    private HotTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.mid == null) {
                this.mid = DEFAULT_MID;
            } else {
                this.mid = builder.mid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.more_text == null) {
                this.more_text = "";
            } else {
                this.more_text = builder.more_text;
            }
            if (builder.more_link == null) {
                this.more_link = "";
            } else {
                this.more_link = builder.more_link;
            }
            if (builder.banner_topic_id == null) {
                this.banner_topic_id = DEFAULT_BANNER_TOPIC_ID;
            } else {
                this.banner_topic_id = builder.banner_topic_id;
            }
            if (builder.banner_topic_pic == null) {
                this.banner_topic_pic = "";
            } else {
                this.banner_topic_pic = builder.banner_topic_pic;
            }
            if (builder.banner_topic_name == null) {
                this.banner_topic_name = "";
            } else {
                this.banner_topic_name = builder.banner_topic_name;
            }
            if (builder.banner_topic_discuss_num == null) {
                this.banner_topic_discuss_num = DEFAULT_BANNER_TOPIC_DISCUSS_NUM;
            } else {
                this.banner_topic_discuss_num = builder.banner_topic_discuss_num;
            }
            if (builder.items == null) {
                this.items = DEFAULT_ITEMS;
                return;
            } else {
                this.items = immutableCopyOf(builder.items);
                return;
            }
        }
        this.mid = builder.mid;
        this.title = builder.title;
        this.more_text = builder.more_text;
        this.more_link = builder.more_link;
        this.banner_topic_id = builder.banner_topic_id;
        this.banner_topic_pic = builder.banner_topic_pic;
        this.banner_topic_name = builder.banner_topic_name;
        this.banner_topic_discuss_num = builder.banner_topic_discuss_num;
        this.items = immutableCopyOf(builder.items);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HotTopic> {
        public Long banner_topic_discuss_num;
        public Long banner_topic_id;
        public String banner_topic_name;
        public String banner_topic_pic;
        public List<HotTopicItem> items;
        public Long mid;
        public String more_link;
        public String more_text;
        public String title;

        public Builder() {
        }

        public Builder(HotTopic hotTopic) {
            super(hotTopic);
            if (hotTopic != null) {
                this.mid = hotTopic.mid;
                this.title = hotTopic.title;
                this.more_text = hotTopic.more_text;
                this.more_link = hotTopic.more_link;
                this.banner_topic_id = hotTopic.banner_topic_id;
                this.banner_topic_pic = hotTopic.banner_topic_pic;
                this.banner_topic_name = hotTopic.banner_topic_name;
                this.banner_topic_discuss_num = hotTopic.banner_topic_discuss_num;
                this.items = HotTopic.copyOf(hotTopic.items);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotTopic build(boolean z) {
            return new HotTopic(this, z, null);
        }
    }
}
