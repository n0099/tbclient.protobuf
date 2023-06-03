package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
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
            if (discoverItem == null) {
                return;
            }
            this.icon_url = discoverItem.icon_url;
            this.title = discoverItem.title;
            this.link_url = discoverItem.link_url;
            this.is_new = discoverItem.is_new;
            this.describe = discoverItem.describe;
            this.statistics = discoverItem.statistics;
            this.is_red_point = discoverItem.is_red_point;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DiscoverItem build(boolean z) {
            return new DiscoverItem(this, z);
        }
    }

    public DiscoverItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.link_url;
            if (str3 == null) {
                this.link_url = "";
            } else {
                this.link_url = str3;
            }
            Integer num = builder.is_new;
            if (num == null) {
                this.is_new = DEFAULT_IS_NEW;
            } else {
                this.is_new = num;
            }
            String str4 = builder.describe;
            if (str4 == null) {
                this.describe = "";
            } else {
                this.describe = str4;
            }
            String str5 = builder.statistics;
            if (str5 == null) {
                this.statistics = "";
            } else {
                this.statistics = str5;
            }
            Integer num2 = builder.is_red_point;
            if (num2 == null) {
                this.is_red_point = DEFAULT_IS_RED_POINT;
                return;
            } else {
                this.is_red_point = num2;
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
}
