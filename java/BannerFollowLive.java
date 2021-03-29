package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class BannerFollowLive extends Message {
    public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SWITCH = 0;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer _switch;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AlaLiveInfo> ala_live_list;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<BannerFollowLive> {
        public Integer _switch;
        public List<AlaLiveInfo> ala_live_list;

        public Builder() {
        }

        public Builder(BannerFollowLive bannerFollowLive) {
            super(bannerFollowLive);
            if (bannerFollowLive == null) {
                return;
            }
            this.ala_live_list = Message.copyOf(bannerFollowLive.ala_live_list);
            this._switch = bannerFollowLive._switch;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BannerFollowLive build(boolean z) {
            return new BannerFollowLive(this, z);
        }
    }

    public BannerFollowLive(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<AlaLiveInfo> list = builder.ala_live_list;
            if (list == null) {
                this.ala_live_list = DEFAULT_ALA_LIVE_LIST;
            } else {
                this.ala_live_list = Message.immutableCopyOf(list);
            }
            Integer num = builder._switch;
            if (num == null) {
                this._switch = DEFAULT_SWITCH;
                return;
            } else {
                this._switch = num;
                return;
            }
        }
        this.ala_live_list = Message.immutableCopyOf(builder.ala_live_list);
        this._switch = builder._switch;
    }
}
