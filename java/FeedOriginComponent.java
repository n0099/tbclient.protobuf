package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedOriginComponent extends Message {
    public static final List<FeedContentResource> DEFAULT_ABSTRACT = Collections.emptyList();
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedContentResource> _abstract;
    @ProtoField(tag = 5)
    public final FeedItem item;
    @ProtoField(tag = 2)
    public final FeedOriginPic pic_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 3)
    public final VideoField video;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedOriginComponent> {
        public List<FeedContentResource> _abstract;
        public FeedItem item;
        public FeedOriginPic pic_info;
        public String schema;
        public VideoField video;

        public Builder() {
        }

        public Builder(FeedOriginComponent feedOriginComponent) {
            super(feedOriginComponent);
            if (feedOriginComponent == null) {
                return;
            }
            this._abstract = Message.copyOf(feedOriginComponent._abstract);
            this.pic_info = feedOriginComponent.pic_info;
            this.video = feedOriginComponent.video;
            this.schema = feedOriginComponent.schema;
            this.item = feedOriginComponent.item;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedOriginComponent build(boolean z) {
            return new FeedOriginComponent(this, z);
        }
    }

    public FeedOriginComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedContentResource> list = builder._abstract;
            if (list == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = Message.immutableCopyOf(list);
            }
            this.pic_info = builder.pic_info;
            this.video = builder.video;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            this.item = builder.item;
            return;
        }
        this._abstract = Message.immutableCopyOf(builder._abstract);
        this.pic_info = builder.pic_info;
        this.video = builder.video;
        this.schema = builder.schema;
        this.item = builder.item;
    }
}
