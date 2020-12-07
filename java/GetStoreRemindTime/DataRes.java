package tbclient.GetStoreRemindTime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes24.dex */
public final class DataRes extends Message {
    public static final List<String> DEFAULT_REMIND_TIME = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
    public final List<String> remind_time;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.remind_time == null) {
                this.remind_time = DEFAULT_REMIND_TIME;
                return;
            } else {
                this.remind_time = immutableCopyOf(builder.remind_time);
                return;
            }
        }
        this.remind_time = immutableCopyOf(builder.remind_time);
    }

    /* loaded from: classes24.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<String> remind_time;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.remind_time = DataRes.copyOf(dataRes.remind_time);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
