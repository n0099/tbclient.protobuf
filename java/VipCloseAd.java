package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class VipCloseAd extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
    public final List<Integer> forum_close;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_open;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer vip_close;
    public static final Integer DEFAULT_IS_OPEN = 0;
    public static final Integer DEFAULT_VIP_CLOSE = 0;
    public static final List<Integer> DEFAULT_FORUM_CLOSE = Collections.emptyList();

    private VipCloseAd(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_open == null) {
                this.is_open = DEFAULT_IS_OPEN;
            } else {
                this.is_open = builder.is_open;
            }
            if (builder.vip_close == null) {
                this.vip_close = DEFAULT_VIP_CLOSE;
            } else {
                this.vip_close = builder.vip_close;
            }
            if (builder.forum_close == null) {
                this.forum_close = DEFAULT_FORUM_CLOSE;
                return;
            } else {
                this.forum_close = immutableCopyOf(builder.forum_close);
                return;
            }
        }
        this.is_open = builder.is_open;
        this.vip_close = builder.vip_close;
        this.forum_close = immutableCopyOf(builder.forum_close);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<VipCloseAd> {
        public List<Integer> forum_close;
        public Integer is_open;
        public Integer vip_close;

        public Builder() {
        }

        public Builder(VipCloseAd vipCloseAd) {
            super(vipCloseAd);
            if (vipCloseAd != null) {
                this.is_open = vipCloseAd.is_open;
                this.vip_close = vipCloseAd.vip_close;
                this.forum_close = VipCloseAd.copyOf(vipCloseAd.forum_close);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipCloseAd build(boolean z) {
            return new VipCloseAd(this, z);
        }
    }
}
