package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PbSortType extends Message {
    public static final String DEFAULT_SORT_NAME = "";
    public static final Integer DEFAULT_SORT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sort_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sort_type;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PbSortType> {
        public String sort_name;
        public Integer sort_type;

        public Builder() {
        }

        public Builder(PbSortType pbSortType) {
            super(pbSortType);
            if (pbSortType == null) {
                return;
            }
            this.sort_type = pbSortType.sort_type;
            this.sort_name = pbSortType.sort_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbSortType build(boolean z) {
            return new PbSortType(this, z);
        }
    }

    public PbSortType(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.sort_type;
            if (num == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num;
            }
            String str = builder.sort_name;
            if (str == null) {
                this.sort_name = "";
                return;
            } else {
                this.sort_name = str;
                return;
            }
        }
        this.sort_type = builder.sort_type;
        this.sort_name = builder.sort_name;
    }
}
