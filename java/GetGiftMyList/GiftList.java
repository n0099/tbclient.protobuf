package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GiftList extends Message {
    @ProtoField(tag = 2)
    public final Gift gift;
    @ProtoField(tag = 1)
    public final Sender sender;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GiftList> {
        public Gift gift;
        public Sender sender;

        public Builder() {
        }

        public Builder(GiftList giftList) {
            super(giftList);
            if (giftList == null) {
                return;
            }
            this.sender = giftList.sender;
            this.gift = giftList.gift;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftList build(boolean z) {
            return new GiftList(this, z);
        }
    }

    public GiftList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.sender = builder.sender;
            this.gift = builder.gift;
            return;
        }
        this.sender = builder.sender;
        this.gift = builder.gift;
    }
}
