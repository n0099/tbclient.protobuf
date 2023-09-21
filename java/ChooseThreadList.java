package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ChooseThreadList extends Message {
    public static final Long DEFAULT_TID = 0L;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ChooseThreadList> {
        public Long tid;
        public String title;

        public Builder() {
        }

        public Builder(ChooseThreadList chooseThreadList) {
            super(chooseThreadList);
            if (chooseThreadList == null) {
                return;
            }
            this.tid = chooseThreadList.tid;
            this.title = chooseThreadList.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChooseThreadList build(boolean z) {
            return new ChooseThreadList(this, z);
        }
    }

    public ChooseThreadList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
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
        this.tid = builder.tid;
        this.title = builder.title;
    }
}
