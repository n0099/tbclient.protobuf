package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PicTextItem;
/* loaded from: classes.dex */
public final class Banner extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PicTextItem> items;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long mid;
    public static final Long DEFAULT_MID = 0L;
    public static final List<PicTextItem> DEFAULT_ITEMS = Collections.emptyList();

    /* synthetic */ Banner(Builder builder, boolean z, Banner banner) {
        this(builder, z);
    }

    private Banner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.mid == null) {
                this.mid = DEFAULT_MID;
            } else {
                this.mid = builder.mid;
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
        this.items = immutableCopyOf(builder.items);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Banner> {
        public List<PicTextItem> items;
        public Long mid;

        public Builder() {
        }

        public Builder(Banner banner) {
            super(banner);
            if (banner != null) {
                this.mid = banner.mid;
                this.items = Banner.copyOf(banner.items);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Banner build(boolean z) {
            return new Banner(this, z, null);
        }
    }
}
