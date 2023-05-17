package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class PbGoodsInfo extends Message {
    public static final String DEFAULT_GOODS_FROM = "";
    public static final String DEFAULT_GOODS_IMAGE = "";
    public static final String DEFAULT_GOODS_PRICE = "";
    public static final String DEFAULT_GOODS_TITLE = "";
    public static final String DEFAULT_GOODS_URL = "";
    public static final String DEFAULT_GOODS_URL_H5 = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String goods_from;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long goods_id;
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
    public static final Integer DEFAULT_SORT = 0;
    public static final Long DEFAULT_GOODS_ID = 0L;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PbGoodsInfo> {
        public String goods_from;
        public Long goods_id;
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
            if (pbGoodsInfo == null) {
                return;
            }
            this.goods_title = pbGoodsInfo.goods_title;
            this.goods_image = pbGoodsInfo.goods_image;
            this.goods_price = pbGoodsInfo.goods_price;
            this.goods_url = pbGoodsInfo.goods_url;
            this.sort = pbGoodsInfo.sort;
            this.goods_from = pbGoodsInfo.goods_from;
            this.goods_url_h5 = pbGoodsInfo.goods_url_h5;
            this.goods_id = pbGoodsInfo.goods_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbGoodsInfo build(boolean z) {
            return new PbGoodsInfo(this, z);
        }
    }

    public PbGoodsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.goods_title;
            if (str == null) {
                this.goods_title = "";
            } else {
                this.goods_title = str;
            }
            String str2 = builder.goods_image;
            if (str2 == null) {
                this.goods_image = "";
            } else {
                this.goods_image = str2;
            }
            String str3 = builder.goods_price;
            if (str3 == null) {
                this.goods_price = "";
            } else {
                this.goods_price = str3;
            }
            String str4 = builder.goods_url;
            if (str4 == null) {
                this.goods_url = "";
            } else {
                this.goods_url = str4;
            }
            Integer num = builder.sort;
            if (num == null) {
                this.sort = DEFAULT_SORT;
            } else {
                this.sort = num;
            }
            String str5 = builder.goods_from;
            if (str5 == null) {
                this.goods_from = "";
            } else {
                this.goods_from = str5;
            }
            String str6 = builder.goods_url_h5;
            if (str6 == null) {
                this.goods_url_h5 = "";
            } else {
                this.goods_url_h5 = str6;
            }
            Long l = builder.goods_id;
            if (l == null) {
                this.goods_id = DEFAULT_GOODS_ID;
                return;
            } else {
                this.goods_id = l;
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
        this.goods_id = builder.goods_id;
    }
}
