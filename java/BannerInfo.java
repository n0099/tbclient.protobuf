package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class BannerInfo extends Message {
    public static final List<GodBanner> DEFAULT_GOD_BANNER_LIST = Collections.emptyList();
    public static final String DEFAULT_GOD_GOOD_URL = "";
    public static final String DEFAULT_GOD_RANK_URL = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GodBanner> god_banner_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String god_good_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String god_rank_url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<BannerInfo> {
        public List<GodBanner> god_banner_list;
        public String god_good_url;
        public String god_rank_url;

        public Builder() {
        }

        public Builder(BannerInfo bannerInfo) {
            super(bannerInfo);
            if (bannerInfo == null) {
                return;
            }
            this.god_banner_list = Message.copyOf(bannerInfo.god_banner_list);
            this.god_good_url = bannerInfo.god_good_url;
            this.god_rank_url = bannerInfo.god_rank_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerInfo build(boolean z) {
            return new BannerInfo(this, z);
        }
    }

    public BannerInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<GodBanner> list = builder.god_banner_list;
            if (list == null) {
                this.god_banner_list = DEFAULT_GOD_BANNER_LIST;
            } else {
                this.god_banner_list = Message.immutableCopyOf(list);
            }
            String str = builder.god_good_url;
            if (str == null) {
                this.god_good_url = "";
            } else {
                this.god_good_url = str;
            }
            String str2 = builder.god_rank_url;
            if (str2 == null) {
                this.god_rank_url = "";
                return;
            } else {
                this.god_rank_url = str2;
                return;
            }
        }
        this.god_banner_list = Message.immutableCopyOf(builder.god_banner_list);
        this.god_good_url = builder.god_good_url;
        this.god_rank_url = builder.god_rank_url;
    }
}
