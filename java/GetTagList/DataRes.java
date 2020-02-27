package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static final List<ResponseTagInfo> DEFAULT_SEX_TAGLIST = Collections.emptyList();
    public static final List<ResponseTagInfo> DEFAULT_TAGLIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ResponseTagInfo> sex_taglist;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ResponseTagInfo> taglist;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.sex_taglist == null) {
                this.sex_taglist = DEFAULT_SEX_TAGLIST;
            } else {
                this.sex_taglist = immutableCopyOf(builder.sex_taglist);
            }
            if (builder.taglist == null) {
                this.taglist = DEFAULT_TAGLIST;
                return;
            } else {
                this.taglist = immutableCopyOf(builder.taglist);
                return;
            }
        }
        this.sex_taglist = immutableCopyOf(builder.sex_taglist);
        this.taglist = immutableCopyOf(builder.taglist);
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ResponseTagInfo> sex_taglist;
        public List<ResponseTagInfo> taglist;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.sex_taglist = DataRes.copyOf(dataRes.sex_taglist);
                this.taglist = DataRes.copyOf(dataRes.taglist);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
