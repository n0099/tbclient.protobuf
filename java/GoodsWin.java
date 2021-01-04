package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class GoodsWin extends Message {
    public static final String DEFAULT_GOODS_URL = "";
    public static final Integer DEFAULT_SHOW = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String goods_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer show;

    private GoodsWin(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.show == null) {
                this.show = DEFAULT_SHOW;
            } else {
                this.show = builder.show;
            }
            if (builder.goods_url == null) {
                this.goods_url = "";
                return;
            } else {
                this.goods_url = builder.goods_url;
                return;
            }
        }
        this.show = builder.show;
        this.goods_url = builder.goods_url;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GoodsWin> {
        public String goods_url;
        public Integer show;

        public Builder() {
        }

        public Builder(GoodsWin goodsWin) {
            super(goodsWin);
            if (goodsWin != null) {
                this.show = goodsWin.show;
                this.goods_url = goodsWin.goods_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GoodsWin build(boolean z) {
            return new GoodsWin(this, z);
        }
    }
}
