package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class PresentNumInfo extends Message {
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUM = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer num;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<PresentNumInfo> {
        public String name;
        public Integer num;

        public Builder() {
        }

        public Builder(PresentNumInfo presentNumInfo) {
            super(presentNumInfo);
            if (presentNumInfo == null) {
                return;
            }
            this.num = presentNumInfo.num;
            this.name = presentNumInfo.name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresentNumInfo build(boolean z) {
            return new PresentNumInfo(this, z);
        }
    }

    public PresentNumInfo(Builder builder, boolean z) {
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
