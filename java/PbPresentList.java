package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class PbPresentList extends Message {
    public static final String DEFAULT_GIFT_NAME = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String gift_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Integer DEFAULT_NUM = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PbPresentList> {
        public Integer gift_id;
        public String gift_name;
        public Integer num;
        public String thumbnail_url;

        public Builder() {
        }

        public Builder(PbPresentList pbPresentList) {
            super(pbPresentList);
            if (pbPresentList == null) {
                return;
            }
            this.gift_id = pbPresentList.gift_id;
            this.gift_name = pbPresentList.gift_name;
            this.thumbnail_url = pbPresentList.thumbnail_url;
            this.num = pbPresentList.num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbPresentList build(boolean z) {
            return new PbPresentList(this, z);
        }
    }

    public PbPresentList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str = builder.gift_name;
            if (str == null) {
                this.gift_name = "";
            } else {
                this.gift_name = str;
            }
            String str2 = builder.thumbnail_url;
            if (str2 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str2;
            }
            Integer num2 = builder.num;
            if (num2 == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = num2;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.gift_name = builder.gift_name;
        this.thumbnail_url = builder.thumbnail_url;
        this.num = builder.num;
    }
}
