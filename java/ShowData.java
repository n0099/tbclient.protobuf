package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ShowData extends Message {
    public static final Integer DEFAULT_SHOW = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer show;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ShowData> {
        public Integer show;

        public Builder() {
        }

        public Builder(ShowData showData) {
            super(showData);
            if (showData == null) {
                return;
            }
            this.show = showData.show;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShowData build(boolean z) {
            return new ShowData(this, z);
        }
    }

    public ShowData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.show;
            if (num == null) {
                this.show = DEFAULT_SHOW;
                return;
            } else {
                this.show = num;
                return;
            }
        }
        this.show = builder.show;
    }
}
