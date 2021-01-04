package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PbGoodsInfo extends Message {
    public static final String DEFAULT_GOODS_FROM = "";
    public static final String DEFAULT_GOODS_IMAGE = "";
    public static final String DEFAULT_GOODS_PRICE = "";
    public static final String DEFAULT_GOODS_TITLE = "";
    public static final String DEFAULT_GOODS_URL = "";
    public static final String DEFAULT_GOODS_URL_H5 = "";
    public static final Integer DEFAULT_SORT = 0;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String goods_from;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String goods_image;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String goods_price;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String goods_title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String goods_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String goods_url_h5;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer sort;

    private PbGoodsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.goods_title == null) {
                this.goods_title = "";
            } else {
                this.goods_title = builder.goods_title;
            }
            if (builder.goods_image == null) {
                this.goods_image = "";
            } else {
                this.goods_image = builder.goods_image;
            }
            if (builder.goods_price == null) {
                this.goods_price = "";
            } else {
                this.goods_price = builder.goods_price;
            }
            if (builder.goods_url == null) {
                this.goods_url = "";
            } else {
                this.goods_url = builder.goods_url;
            }
            if (builder.sort == null) {
                this.sort = DEFAULT_SORT;
            } else {
                this.sort = builder.sort;
            }
            if (builder.goods_from == null) {
                this.goods_from = "";
            } else {
                this.goods_from = builder.goods_from;
            }
            if (builder.goods_url_h5 == null) {
                this.goods_url_h5 = "";
                return;
            } else {
                this.goods_url_h5 = builder.goods_url_h5;
                return;
            }
        }
        this.goods_title = builder.goods_title;
        this.goods_image = builder.goods_image;
        this.goods_price = builder.goods_price;
        this.goods_url = builder.goods_url;
        this.sort = builder.sort;
        this.goods_from = builder.goods_from;
        this.goods_url_h5 = builder.goods_url_h5;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PbGoodsInfo> {
        public String goods_from;
        public String goods_image;
        public String goods_price;
        public String goods_title;
        public String goods_url;
        public String goods_url_h5;
        public Integer sort;

        public Builder() {
        }

        public Builder(PbGoodsInfo pbGoodsInfo) {
            super(pbGoodsInfo);
            if (pbGoodsInfo != null) {
                this.goods_title = pbGoodsInfo.goods_title;
                this.goods_image = pbGoodsInfo.goods_image;
                this.goods_price = pbGoodsInfo.goods_price;
                this.goods_url = pbGoodsInfo.goods_url;
                this.sort = pbGoodsInfo.sort;
                this.goods_from = pbGoodsInfo.goods_from;
                this.goods_url_h5 = pbGoodsInfo.goods_url_h5;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbGoodsInfo build(boolean z) {
            return new PbGoodsInfo(this, z);
        }
    }
}
