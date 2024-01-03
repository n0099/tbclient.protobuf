package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ChooseTimeList extends Message {
    public static final Long DEFAULT_TIME = 0L;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ChooseTimeList> {
        public Long time;
        public String title;

        public Builder() {
        }

        public Builder(ChooseTimeList chooseTimeList) {
            super(chooseTimeList);
            if (chooseTimeList == null) {
                return;
            }
            this.time = chooseTimeList.time;
            this.title = chooseTimeList.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChooseTimeList build(boolean z) {
            return new ChooseTimeList(this, z);
        }
    }

    public ChooseTimeList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.time;
            if (l == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
                return;
            } else {
                this.title = str;
                return;
            }
        }
        this.time = builder.time;
        this.title = builder.title;
    }
}
