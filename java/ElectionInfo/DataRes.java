package tbclient.ElectionInfo;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ElectionList;
import tbclient.ManagerElection;
import tbclient.Myrecord;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<ElectionList> DEFAULT_ELECTION_LIST;
    public static final Integer DEFAULT_HAS_MORE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)
    public final Basic basic;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ElectionList> election_list;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 2)
    public final Myrecord my_record;
    @ProtoField(tag = 5)
    public final ManagerElection vote_limit;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Basic basic;
        public List<ElectionList> election_list;
        public Integer has_more;
        public Myrecord my_record;
        public ManagerElection vote_limit;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (dataRes == null) {
                return;
            }
            this.basic = dataRes.basic;
            this.my_record = dataRes.my_record;
            this.election_list = Message.copyOf(dataRes.election_list);
            this.has_more = dataRes.has_more;
            this.vote_limit = dataRes.vote_limit;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1192171389, "Ltbclient/ElectionInfo/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1192171389, "Ltbclient/ElectionInfo/DataRes;");
                return;
            }
        }
        DEFAULT_ELECTION_LIST = Collections.emptyList();
        DEFAULT_HAS_MORE = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            this.basic = builder.basic;
            this.my_record = builder.my_record;
            List<ElectionList> list = builder.election_list;
            if (list == null) {
                this.election_list = DEFAULT_ELECTION_LIST;
            } else {
                this.election_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            this.vote_limit = builder.vote_limit;
            return;
        }
        this.basic = builder.basic;
        this.my_record = builder.my_record;
        this.election_list = Message.immutableCopyOf(builder.election_list);
        this.has_more = builder.has_more;
        this.vote_limit = builder.vote_limit;
    }
}
