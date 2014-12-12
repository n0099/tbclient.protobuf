package tbclient.FoundNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<Module> DEFAULT_MODULE = Collections.emptyList();
    public static final Long DEFAULT_TIMESTAMP = 0L;
    @ProtoField(tag = 2)
    public final Banner banner;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Module> module;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long timestamp;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.module == null) {
                this.module = DEFAULT_MODULE;
            } else {
                this.module = immutableCopyOf(builder.module);
            }
            this.banner = builder.banner;
            if (builder.timestamp == null) {
                this.timestamp = DEFAULT_TIMESTAMP;
                return;
            } else {
                this.timestamp = builder.timestamp;
                return;
            }
        }
        this.module = immutableCopyOf(builder.module);
        this.banner = builder.banner;
        this.timestamp = builder.timestamp;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public Banner banner;
        public List<Module> module;
        public Long timestamp;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.module = DataRes.copyOf(dataRes.module);
                this.banner = dataRes.banner;
                this.timestamp = dataRes.timestamp;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
