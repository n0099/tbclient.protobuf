package tbclient.GetDynamicGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GiftZip extends Message {
    public static final Integer DEFAULT_IS_LANDSCAPE = 0;
    public static final String DEFAULT_ZIP_MD5 = "";
    public static final String DEFAULT_ZIP_NAME = "";
    public static final String DEFAULT_ZIP_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_landscape;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String zip_md5;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String zip_name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String zip_url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GiftZip> {
        public Integer is_landscape;
        public String zip_md5;
        public String zip_name;
        public String zip_url;

        public Builder() {
        }

        public Builder(GiftZip giftZip) {
            super(giftZip);
            if (giftZip == null) {
                return;
            }
            this.zip_md5 = giftZip.zip_md5;
            this.zip_url = giftZip.zip_url;
            this.zip_name = giftZip.zip_name;
            this.is_landscape = giftZip.is_landscape;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftZip build(boolean z) {
            return new GiftZip(this, z);
        }
    }

    public GiftZip(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.zip_md5;
            if (str == null) {
                this.zip_md5 = "";
            } else {
                this.zip_md5 = str;
            }
            String str2 = builder.zip_url;
            if (str2 == null) {
                this.zip_url = "";
            } else {
                this.zip_url = str2;
            }
            String str3 = builder.zip_name;
            if (str3 == null) {
                this.zip_name = "";
            } else {
                this.zip_name = str3;
            }
            Integer num = builder.is_landscape;
            if (num == null) {
                this.is_landscape = DEFAULT_IS_LANDSCAPE;
                return;
            } else {
                this.is_landscape = num;
                return;
            }
        }
        this.zip_md5 = builder.zip_md5;
        this.zip_url = builder.zip_url;
        this.zip_name = builder.zip_name;
        this.is_landscape = builder.is_landscape;
    }
}
