package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class CardInfo extends Message {
    @ProtoField(tag = 2)
    public final InsertFloor insert_floor;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_info;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CardInfo> {
        public InsertFloor insert_floor;
        public ThreadInfo thread_info;

        public Builder() {
        }

        public Builder(CardInfo cardInfo) {
            super(cardInfo);
            if (cardInfo == null) {
                return;
            }
            this.thread_info = cardInfo.thread_info;
            this.insert_floor = cardInfo.insert_floor;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CardInfo build(boolean z) {
            return new CardInfo(this, z);
        }
    }

    public CardInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_info = builder.thread_info;
            this.insert_floor = builder.insert_floor;
            return;
        }
        this.thread_info = builder.thread_info;
        this.insert_floor = builder.insert_floor;
    }
}
