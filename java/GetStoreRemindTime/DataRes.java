package tbclient.GetStoreRemindTime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<String> DEFAULT_REMIND_TIME = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> remind_time;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<String> remind_time;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.remind_time = Message.copyOf(dataRes.remind_time);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<String> list = builder.remind_time;
            if (list == null) {
                this.remind_time = DEFAULT_REMIND_TIME;
                return;
            } else {
                this.remind_time = Message.immutableCopyOf(list);
                return;
            }
        }
        this.remind_time = Message.immutableCopyOf(builder.remind_time);
    }
}
