package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class LayoutFactory extends Message {
    public static final String DEFAULT_LAYOUT = "";
    @ProtoField(tag = 6)
    public final VideoDoubleRowLayout double_row_video;
    @ProtoField(tag = 2)
    public final FeedLayout feed;
    @ProtoField(tag = 5)
    public final FrsTopThreadCardLayout frs_top_thread_card;
    @ProtoField(tag = 4)
    public final HeadcardLayout headcard;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String layout;
    @ProtoField(tag = 3)
    public final SidewayLayout sideway;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<LayoutFactory> {
        public VideoDoubleRowLayout double_row_video;
        public FeedLayout feed;
        public FrsTopThreadCardLayout frs_top_thread_card;
        public HeadcardLayout headcard;
        public String layout;
        public SidewayLayout sideway;

        public Builder() {
        }

        public Builder(LayoutFactory layoutFactory) {
            super(layoutFactory);
            if (layoutFactory == null) {
                return;
            }
            this.layout = layoutFactory.layout;
            this.feed = layoutFactory.feed;
            this.sideway = layoutFactory.sideway;
            this.headcard = layoutFactory.headcard;
            this.frs_top_thread_card = layoutFactory.frs_top_thread_card;
            this.double_row_video = layoutFactory.double_row_video;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LayoutFactory build(boolean z) {
            return new LayoutFactory(this, z);
        }
    }

    public LayoutFactory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.layout;
            if (str == null) {
                this.layout = "";
            } else {
                this.layout = str;
            }
            this.feed = builder.feed;
            this.sideway = builder.sideway;
            this.headcard = builder.headcard;
            this.frs_top_thread_card = builder.frs_top_thread_card;
            this.double_row_video = builder.double_row_video;
            return;
        }
        this.layout = builder.layout;
        this.feed = builder.feed;
        this.sideway = builder.sideway;
        this.headcard = builder.headcard;
        this.frs_top_thread_card = builder.frs_top_thread_card;
        this.double_row_video = builder.double_row_video;
    }
}
