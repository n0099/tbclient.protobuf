package tbclient.Person;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer geo;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer offset;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<UserInfos> user_infos;
    public static final List<UserInfos> DEFAULT_USER_INFOS = Collections.emptyList();
    public static final Integer DEFAULT_GEO = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_infos == null) {
                this.user_infos = DEFAULT_USER_INFOS;
            } else {
                this.user_infos = immutableCopyOf(builder.user_infos);
            }
            if (builder.geo == null) {
                this.geo = DEFAULT_GEO;
            } else {
                this.geo = builder.geo;
            }
            if (builder.offset == null) {
                this.offset = DEFAULT_OFFSET;
            } else {
                this.offset = builder.offset;
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.user_infos = immutableCopyOf(builder.user_infos);
        this.geo = builder.geo;
        this.offset = builder.offset;
        this.has_more = builder.has_more;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public Integer geo;
        public Integer has_more;
        public Integer offset;
        public List<UserInfos> user_infos;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user_infos = DataRes.copyOf(dataRes.user_infos);
                this.geo = dataRes.geo;
                this.offset = dataRes.offset;
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
