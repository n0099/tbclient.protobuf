package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_RELATE_FORUM_TITLE = "";
    @ProtoField(tag = 7)
    public final CommonInteraction bless_module;
    @ProtoField(tag = 8)
    public final CommonInteraction candle_module;
    @ProtoField(tag = 9)
    public final HotThread good_threads;
    @ProtoField(tag = 3)
    public final HotThread hot_thread;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_global_block;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(tag = 2)
    public final MagicPost magic_post;
    @ProtoField(tag = 6)
    public final PkModule pk_module;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<RelateForum> post_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RelateForum> relate_forum;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String relate_forum_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<SpecialTopic> special_topic;
    @ProtoField(tag = 5)
    public final ThreadModule thread_module;
    @ProtoField(tag = 4)
    public final TopicInfo topic_info;
    @ProtoField(tag = 15)
    public final CommonInteraction weiguan_module;
    public static final List<RelateForum> DEFAULT_RELATE_FORUM = Collections.emptyList();
    public static final Integer DEFAULT_IS_NEW_URL = 0;
    public static final List<RelateForum> DEFAULT_POST_FORUM = Collections.emptyList();
    public static final Integer DEFAULT_IS_GLOBAL_BLOCK = 0;
    public static final List<SpecialTopic> DEFAULT_SPECIAL_TOPIC = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.relate_forum == null) {
                this.relate_forum = DEFAULT_RELATE_FORUM;
            } else {
                this.relate_forum = immutableCopyOf(builder.relate_forum);
            }
            this.magic_post = builder.magic_post;
            this.hot_thread = builder.hot_thread;
            this.topic_info = builder.topic_info;
            this.thread_module = builder.thread_module;
            this.pk_module = builder.pk_module;
            this.bless_module = builder.bless_module;
            this.candle_module = builder.candle_module;
            this.good_threads = builder.good_threads;
            if (builder.is_new_url == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = builder.is_new_url;
            }
            if (builder.post_forum == null) {
                this.post_forum = DEFAULT_POST_FORUM;
            } else {
                this.post_forum = immutableCopyOf(builder.post_forum);
            }
            if (builder.is_global_block == null) {
                this.is_global_block = DEFAULT_IS_GLOBAL_BLOCK;
            } else {
                this.is_global_block = builder.is_global_block;
            }
            if (builder.special_topic == null) {
                this.special_topic = DEFAULT_SPECIAL_TOPIC;
            } else {
                this.special_topic = immutableCopyOf(builder.special_topic);
            }
            if (builder.relate_forum_title == null) {
                this.relate_forum_title = "";
            } else {
                this.relate_forum_title = builder.relate_forum_title;
            }
            this.weiguan_module = builder.weiguan_module;
            return;
        }
        this.relate_forum = immutableCopyOf(builder.relate_forum);
        this.magic_post = builder.magic_post;
        this.hot_thread = builder.hot_thread;
        this.topic_info = builder.topic_info;
        this.thread_module = builder.thread_module;
        this.pk_module = builder.pk_module;
        this.bless_module = builder.bless_module;
        this.candle_module = builder.candle_module;
        this.good_threads = builder.good_threads;
        this.is_new_url = builder.is_new_url;
        this.post_forum = immutableCopyOf(builder.post_forum);
        this.is_global_block = builder.is_global_block;
        this.special_topic = immutableCopyOf(builder.special_topic);
        this.relate_forum_title = builder.relate_forum_title;
        this.weiguan_module = builder.weiguan_module;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public CommonInteraction bless_module;
        public CommonInteraction candle_module;
        public HotThread good_threads;
        public HotThread hot_thread;
        public Integer is_global_block;
        public Integer is_new_url;
        public MagicPost magic_post;
        public PkModule pk_module;
        public List<RelateForum> post_forum;
        public List<RelateForum> relate_forum;
        public String relate_forum_title;
        public List<SpecialTopic> special_topic;
        public ThreadModule thread_module;
        public TopicInfo topic_info;
        public CommonInteraction weiguan_module;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.relate_forum = DataRes.copyOf(dataRes.relate_forum);
                this.magic_post = dataRes.magic_post;
                this.hot_thread = dataRes.hot_thread;
                this.topic_info = dataRes.topic_info;
                this.thread_module = dataRes.thread_module;
                this.pk_module = dataRes.pk_module;
                this.bless_module = dataRes.bless_module;
                this.candle_module = dataRes.candle_module;
                this.good_threads = dataRes.good_threads;
                this.is_new_url = dataRes.is_new_url;
                this.post_forum = DataRes.copyOf(dataRes.post_forum);
                this.is_global_block = dataRes.is_global_block;
                this.special_topic = DataRes.copyOf(dataRes.special_topic);
                this.relate_forum_title = dataRes.relate_forum_title;
                this.weiguan_module = dataRes.weiguan_module;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
