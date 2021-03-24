package tbclient.HistorySwan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SmartApp;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<SmartApp> DEFAULT_SWAN_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<SmartApp> swan_list;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<SmartApp> swan_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.swan_list = Message.copyOf(dataRes.swan_list);
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
            List<SmartApp> list = builder.swan_list;
            if (list == null) {
                this.swan_list = DEFAULT_SWAN_LIST;
                return;
            } else {
                this.swan_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.swan_list = Message.immutableCopyOf(builder.swan_list);
    }
}
