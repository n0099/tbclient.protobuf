package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ComponentFactory extends Message {
    public static final String DEFAULT_BASE_TEXT = "";
    public static final String DEFAULT_COMPONENT = "";
    public static final List<ThreadRecommendInfo> DEFAULT_FEED_RECOMTAG = Collections.emptyList();
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String base_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String component;
    @ProtoField(tag = 4)
    public final AbstractComponent feed_abstract;
    @ProtoField(tag = 10)
    public final FeedEntrybarComponent feed_entrybar;
    @ProtoField(tag = 5)
    public final FeedHeadComponent feed_head;
    @ProtoField(tag = 6)
    public final FeedHeadFigureComponent feed_head_figure;
    @ProtoField(tag = 15)
    public final FeedItem feed_item;
    @ProtoField(tag = 17)
    public final FeedLinkComponent feed_link;
    @ProtoField(tag = 12)
    public final FeedLiveComponent feed_live;
    @ProtoField(tag = 16)
    public final FeedOriginComponent feed_origin;
    @ProtoField(tag = 7)
    public final FeedPicComponent feed_pic;
    @ProtoField(tag = 20)
    public final FeedPostExpose feed_postexpose;
    @ProtoField(label = Message.Label.REPEATED, tag = 18)
    public final List<ThreadRecommendInfo> feed_recomtag;
    @ProtoField(tag = 21)
    public final FeedRoomComponent feed_room;
    @ProtoField(tag = 8)
    public final FeedSocialComponent feed_social;
    @ProtoField(tag = 3)
    public final TitleComponent feed_title;
    @ProtoField(tag = 9)
    public final FeedVideoComponent feed_video;
    @ProtoField(tag = 19)
    public final FeedVideoAdComponent feed_videoad;
    @ProtoField(tag = 11)
    public final Voice feed_voice;
    @ProtoField(tag = 14)
    public final SidewayRecomComponent sideway_recom;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ComponentFactory> {
        public String base_text;
        public String component;
        public AbstractComponent feed_abstract;
        public FeedEntrybarComponent feed_entrybar;
        public FeedHeadComponent feed_head;
        public FeedHeadFigureComponent feed_head_figure;
        public FeedItem feed_item;
        public FeedLinkComponent feed_link;
        public FeedLiveComponent feed_live;
        public FeedOriginComponent feed_origin;
        public FeedPicComponent feed_pic;
        public FeedPostExpose feed_postexpose;
        public List<ThreadRecommendInfo> feed_recomtag;
        public FeedRoomComponent feed_room;
        public FeedSocialComponent feed_social;
        public TitleComponent feed_title;
        public FeedVideoComponent feed_video;
        public FeedVideoAdComponent feed_videoad;
        public Voice feed_voice;
        public SidewayRecomComponent sideway_recom;

        public Builder() {
        }

        public Builder(ComponentFactory componentFactory) {
            super(componentFactory);
            if (componentFactory == null) {
                return;
            }
            this.component = componentFactory.component;
            this.feed_title = componentFactory.feed_title;
            this.feed_abstract = componentFactory.feed_abstract;
            this.feed_head = componentFactory.feed_head;
            this.feed_head_figure = componentFactory.feed_head_figure;
            this.feed_pic = componentFactory.feed_pic;
            this.feed_social = componentFactory.feed_social;
            this.feed_video = componentFactory.feed_video;
            this.feed_entrybar = componentFactory.feed_entrybar;
            this.feed_voice = componentFactory.feed_voice;
            this.feed_live = componentFactory.feed_live;
            this.base_text = componentFactory.base_text;
            this.sideway_recom = componentFactory.sideway_recom;
            this.feed_item = componentFactory.feed_item;
            this.feed_origin = componentFactory.feed_origin;
            this.feed_link = componentFactory.feed_link;
            this.feed_recomtag = Message.copyOf(componentFactory.feed_recomtag);
            this.feed_videoad = componentFactory.feed_videoad;
            this.feed_postexpose = componentFactory.feed_postexpose;
            this.feed_room = componentFactory.feed_room;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ComponentFactory build(boolean z) {
            return new ComponentFactory(this, z);
        }
    }

    public ComponentFactory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.component;
            if (str == null) {
                this.component = "";
            } else {
                this.component = str;
            }
            this.feed_title = builder.feed_title;
            this.feed_abstract = builder.feed_abstract;
            this.feed_head = builder.feed_head;
            this.feed_head_figure = builder.feed_head_figure;
            this.feed_pic = builder.feed_pic;
            this.feed_social = builder.feed_social;
            this.feed_video = builder.feed_video;
            this.feed_entrybar = builder.feed_entrybar;
            this.feed_voice = builder.feed_voice;
            this.feed_live = builder.feed_live;
            String str2 = builder.base_text;
            if (str2 == null) {
                this.base_text = "";
            } else {
                this.base_text = str2;
            }
            this.sideway_recom = builder.sideway_recom;
            this.feed_item = builder.feed_item;
            this.feed_origin = builder.feed_origin;
            this.feed_link = builder.feed_link;
            List<ThreadRecommendInfo> list = builder.feed_recomtag;
            if (list == null) {
                this.feed_recomtag = DEFAULT_FEED_RECOMTAG;
            } else {
                this.feed_recomtag = Message.immutableCopyOf(list);
            }
            this.feed_videoad = builder.feed_videoad;
            this.feed_postexpose = builder.feed_postexpose;
            this.feed_room = builder.feed_room;
            return;
        }
        this.component = builder.component;
        this.feed_title = builder.feed_title;
        this.feed_abstract = builder.feed_abstract;
        this.feed_head = builder.feed_head;
        this.feed_head_figure = builder.feed_head_figure;
        this.feed_pic = builder.feed_pic;
        this.feed_social = builder.feed_social;
        this.feed_video = builder.feed_video;
        this.feed_entrybar = builder.feed_entrybar;
        this.feed_voice = builder.feed_voice;
        this.feed_live = builder.feed_live;
        this.base_text = builder.base_text;
        this.sideway_recom = builder.sideway_recom;
        this.feed_item = builder.feed_item;
        this.feed_origin = builder.feed_origin;
        this.feed_link = builder.feed_link;
        this.feed_recomtag = Message.immutableCopyOf(builder.feed_recomtag);
        this.feed_videoad = builder.feed_videoad;
        this.feed_postexpose = builder.feed_postexpose;
        this.feed_room = builder.feed_room;
    }
}
