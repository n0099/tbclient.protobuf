package tbclient.ActiveConfig;

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
import tbclient.ActiveCenter;
import tbclient.FloatStrategy;
import tbclient.MissionInfo;
/* loaded from: classes3.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVE_URL = "";
    public static final List<FloatStrategy> DEFAULT_FLOAT_LIST;
    public static final Integer DEFAULT_IS_NEW_USER;
    public static final List<MissionInfo> DEFAULT_MISSION_LIST;
    public static final String DEFAULT_NEWUSER_POP_CLICKURL = "";
    public static final String DEFAULT_NEWUSER_POP_MONEY = "";
    public static final String DEFAULT_NEWUSER_POP_TOP = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9)
    public final ActiveCenter active_center;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String active_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<FloatStrategy> float_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_new_user;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<MissionInfo> mission_list;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String newuser_pop_clickurl;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String newuser_pop_money;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String newuser_pop_top;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ActiveCenter active_center;
        public String active_url;
        public List<FloatStrategy> float_list;
        public Integer is_new_user;
        public List<MissionInfo> mission_list;
        public String newuser_pop_clickurl;
        public String newuser_pop_money;
        public String newuser_pop_top;

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
            this.is_new_user = dataRes.is_new_user;
            this.active_url = dataRes.active_url;
            this.mission_list = Message.copyOf(dataRes.mission_list);
            this.float_list = Message.copyOf(dataRes.float_list);
            this.newuser_pop_clickurl = dataRes.newuser_pop_clickurl;
            this.newuser_pop_money = dataRes.newuser_pop_money;
            this.newuser_pop_top = dataRes.newuser_pop_top;
            this.active_center = dataRes.active_center;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-314789854, "Ltbclient/ActiveConfig/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-314789854, "Ltbclient/ActiveConfig/DataRes;");
                return;
            }
        }
        DEFAULT_IS_NEW_USER = 0;
        DEFAULT_MISSION_LIST = Collections.emptyList();
        DEFAULT_FLOAT_LIST = Collections.emptyList();
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
            Integer num = builder.is_new_user;
            if (num == null) {
                this.is_new_user = DEFAULT_IS_NEW_USER;
            } else {
                this.is_new_user = num;
            }
            String str = builder.active_url;
            if (str == null) {
                this.active_url = "";
            } else {
                this.active_url = str;
            }
            List<MissionInfo> list = builder.mission_list;
            if (list == null) {
                this.mission_list = DEFAULT_MISSION_LIST;
            } else {
                this.mission_list = Message.immutableCopyOf(list);
            }
            List<FloatStrategy> list2 = builder.float_list;
            if (list2 == null) {
                this.float_list = DEFAULT_FLOAT_LIST;
            } else {
                this.float_list = Message.immutableCopyOf(list2);
            }
            String str2 = builder.newuser_pop_clickurl;
            if (str2 == null) {
                this.newuser_pop_clickurl = "";
            } else {
                this.newuser_pop_clickurl = str2;
            }
            String str3 = builder.newuser_pop_money;
            if (str3 == null) {
                this.newuser_pop_money = "";
            } else {
                this.newuser_pop_money = str3;
            }
            String str4 = builder.newuser_pop_top;
            if (str4 == null) {
                this.newuser_pop_top = "";
            } else {
                this.newuser_pop_top = str4;
            }
            this.active_center = builder.active_center;
            return;
        }
        this.is_new_user = builder.is_new_user;
        this.active_url = builder.active_url;
        this.mission_list = Message.immutableCopyOf(builder.mission_list);
        this.float_list = Message.immutableCopyOf(builder.float_list);
        this.newuser_pop_clickurl = builder.newuser_pop_clickurl;
        this.newuser_pop_money = builder.newuser_pop_money;
        this.newuser_pop_top = builder.newuser_pop_top;
        this.active_center = builder.active_center;
    }
}
