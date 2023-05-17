package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class NumInfo extends Message {
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUM = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer num;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<NumInfo> {
        public String name;
        public Integer num;

        public Builder() {
        }

        public Builder(NumInfo numInfo) {
            super(numInfo);
            if (numInfo == null) {
                return;
            }
            this.num = numInfo.num;
            this.name = numInfo.name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NumInfo build(boolean z) {
            return new NumInfo(this, z);
        }
    }

    public NumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.num;
            if (num == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
                return;
            } else {
                this.name = str;
                return;
            }
        }
        this.num = builder.num;
        this.name = builder.name;
    }
}
