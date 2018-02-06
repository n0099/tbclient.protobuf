package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class ChannelPage extends Message {
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_TOTAL_COUNT = 0;
    public static final Integer DEFAULT_TOTAL_PAGE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer total_count;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer total_page;

    private ChannelPage(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.total_count == null) {
                this.total_count = DEFAULT_TOTAL_COUNT;
            } else {
                this.total_count = builder.total_count;
            }
            if (builder.total_page == null) {
                this.total_page = DEFAULT_TOTAL_PAGE;
                return;
            } else {
                this.total_page = builder.total_page;
                return;
            }
        }
        this.has_more = builder.has_more;
        this.total_count = builder.total_count;
        this.total_page = builder.total_page;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<ChannelPage> {
        public Integer has_more;
        public Integer total_count;
        public Integer total_page;

        public Builder() {
        }

        public Builder(ChannelPage channelPage) {
            super(channelPage);
            if (channelPage != null) {
                this.has_more = channelPage.has_more;
                this.total_count = channelPage.total_count;
                this.total_page = channelPage.total_page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChannelPage build(boolean z) {
            return new ChannelPage(this, z);
        }
    }
}
