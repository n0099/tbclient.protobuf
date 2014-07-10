package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class BannerList extends Message {
    public static final List<App> DEFAULT_APP = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<App> app;

    /* synthetic */ BannerList(Builder builder, boolean z, BannerList bannerList) {
        this(builder, z);
    }

    private BannerList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.app == null) {
                this.app = DEFAULT_APP;
                return;
            } else {
                this.app = immutableCopyOf(builder.app);
                return;
            }
        }
        this.app = immutableCopyOf(builder.app);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<BannerList> {
        public List<App> app;

        public Builder(BannerList bannerList) {
            super(bannerList);
            if (bannerList != null) {
                this.app = BannerList.copyOf(bannerList.app);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerList build(boolean z) {
            return new BannerList(this, z, null);
        }
    }
}
