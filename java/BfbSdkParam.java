package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class BfbSdkParam extends Message {
    public static final List<Integer> DEFAULT_ACTIVITY_NO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.INT32)
    public final List<Integer> activity_no;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<BfbSdkParam> {
        public List<Integer> activity_no;

        public Builder() {
        }

        public Builder(BfbSdkParam bfbSdkParam) {
            super(bfbSdkParam);
            if (bfbSdkParam == null) {
                return;
            }
            this.activity_no = Message.copyOf(bfbSdkParam.activity_no);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BfbSdkParam build(boolean z) {
            return new BfbSdkParam(this, z);
        }
    }

    public BfbSdkParam(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Integer> list = builder.activity_no;
            if (list == null) {
                this.activity_no = DEFAULT_ACTIVITY_NO;
                return;
            } else {
                this.activity_no = Message.immutableCopyOf(list);
                return;
            }
        }
        this.activity_no = Message.immutableCopyOf(builder.activity_no);
    }
}
