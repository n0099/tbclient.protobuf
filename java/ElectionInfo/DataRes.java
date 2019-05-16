package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ElectionList;
import tbclient.Myrecord;
/* loaded from: classes3.dex */
public final class DataRes extends Message {
    public static final List<ElectionList> DEFAULT_ELECTION_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    @ProtoField(tag = 1)
    public final Basic basic;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ElectionList> election_list;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 2)
    public final Myrecord my_record;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.basic = builder.basic;
            this.my_record = builder.my_record;
            if (builder.election_list == null) {
                this.election_list = DEFAULT_ELECTION_LIST;
            } else {
                this.election_list = immutableCopyOf(builder.election_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.basic = builder.basic;
        this.my_record = builder.my_record;
        this.election_list = immutableCopyOf(builder.election_list);
        this.has_more = builder.has_more;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Basic basic;
        public List<ElectionList> election_list;
        public Integer has_more;
        public Myrecord my_record;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.basic = dataRes.basic;
                this.my_record = dataRes.my_record;
                this.election_list = DataRes.copyOf(dataRes.election_list);
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
