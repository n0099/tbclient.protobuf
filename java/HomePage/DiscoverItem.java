package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DiscoverItem extends Message {
    public static final String DEFAULT_DESCRIBE = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final Integer DEFAULT_IS_NEW = 0;
    public static final Integer DEFAULT_IS_RED_POINT = 0;
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_STATISTICS = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String describe;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_new;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_red_point;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String statistics;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* synthetic */ DiscoverItem(Builder builder, boolean z, DiscoverItem discoverItem) {
        this(builder, z);
    }

    private DiscoverItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.link_url == null) {
                this.link_url = "";
            } else {
                this.link_url = builder.link_url;
            }
            if (builder.is_new == null) {
                this.is_new = DEFAULT_IS_NEW;
            } else {
                this.is_new = builder.is_new;
            }
            if (builder.describe == null) {
                this.describe = "";
            } else {
                this.describe = builder.describe;
            }
            if (builder.statistics == null) {
                this.statistics = "";
            } else {
                this.statistics = builder.statistics;
            }
            if (builder.is_red_point == null) {
                this.is_red_point = DEFAULT_IS_RED_POINT;
                return;
            } else {
                this.is_red_point = builder.is_red_point;
                return;
            }
        }
        this.icon_url = builder.icon_url;
        this.title = builder.title;
        this.link_url = builder.link_url;
        this.is_new = builder.is_new;
        this.describe = builder.describe;
        this.statistics = builder.statistics;
        this.is_red_point = builder.is_red_point;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DiscoverItem> {
        public String describe;
        public String icon_url;
        public Integer is_new;
        public Integer is_red_point;
        public String link_url;
        public String statistics;
        public String title;

        public Builder() {
        }

        public Builder(DiscoverItem discoverItem) {
            super(discoverItem);
            if (discoverItem != null) {
                this.icon_url = discoverItem.icon_url;
                this.title = discoverItem.title;
                this.link_url = discoverItem.link_url;
                this.is_new = discoverItem.is_new;
                this.describe = discoverItem.describe;
                this.statistics = discoverItem.statistics;
                this.is_red_point = discoverItem.is_red_point;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DiscoverItem build(boolean z) {
            return new DiscoverItem(this, z, null);
        }
    }
}
