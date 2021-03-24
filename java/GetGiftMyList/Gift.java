package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Gift extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PLAY_URL = "";
    public static final String DEFAULT_THUMBNAIL_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String play_url;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer send_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    public static final Integer DEFAULT_GIFT_ID = 0;
    public static final Integer DEFAULT_SEND_TIME = 0;
    public static final Integer DEFAULT_NUM = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Gift> {
        public Integer gift_id;
        public String name;
        public Integer num;
        public String play_url;
        public Integer send_time;
        public String thumbnail_url;

        public Builder() {
        }

        public Builder(Gift gift) {
            super(gift);
            if (gift == null) {
                return;
            }
            this.gift_id = gift.gift_id;
            this.name = gift.name;
            this.play_url = gift.play_url;
            this.thumbnail_url = gift.thumbnail_url;
            this.send_time = gift.send_time;
            this.num = gift.num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Gift build(boolean z) {
            return new Gift(this, z);
        }
    }

    public Gift(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.play_url;
            if (str2 == null) {
                this.play_url = "";
            } else {
                this.play_url = str2;
            }
            String str3 = builder.thumbnail_url;
            if (str3 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str3;
            }
            Integer num2 = builder.send_time;
            if (num2 == null) {
                this.send_time = DEFAULT_SEND_TIME;
            } else {
                this.send_time = num2;
            }
            Integer num3 = builder.num;
            if (num3 == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = num3;
                return;
            }
        }
        this.gift_id = builder.gift_id;
        this.name = builder.name;
        this.play_url = builder.play_url;
        this.thumbnail_url = builder.thumbnail_url;
        this.send_time = builder.send_time;
        this.num = builder.num;
    }
}
