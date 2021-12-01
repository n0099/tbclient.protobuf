package tbclient.GetGiftList;

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
/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ADDFREE_URL = "";
    public static final Integer DEFAULT_CURRENCY_TYPE;
    public static final Integer DEFAULT_FREE_CHANCE;
    public static final List<PresentGiftList1> DEFAULT_GIFT_LIST;
    public static final List<PresentCategoryList> DEFAULT_LIST;
    public static final List<PresentNumInfo> DEFAULT_NUM_INFO;
    public static final Integer DEFAULT_SCENE_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String addfree_url;
    @ProtoField(tag = 8)
    public final UrlTitle currency_txt;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer currency_type;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer free_chance;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<PresentGiftList1> gift_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PresentCategoryList> list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PresentNumInfo> num_info;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer scene_id;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String addfree_url;
        public UrlTitle currency_txt;
        public Integer currency_type;
        public Integer free_chance;
        public List<PresentGiftList1> gift_list;
        public List<PresentCategoryList> list;
        public List<PresentNumInfo> num_info;
        public Integer scene_id;

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
            this.list = Message.copyOf(dataRes.list);
            this.num_info = Message.copyOf(dataRes.num_info);
            this.addfree_url = dataRes.addfree_url;
            this.gift_list = Message.copyOf(dataRes.gift_list);
            this.free_chance = dataRes.free_chance;
            this.scene_id = dataRes.scene_id;
            this.currency_type = dataRes.currency_type;
            this.currency_txt = dataRes.currency_txt;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2016215878, "Ltbclient/GetGiftList/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2016215878, "Ltbclient/GetGiftList/DataRes;");
                return;
            }
        }
        DEFAULT_LIST = Collections.emptyList();
        DEFAULT_NUM_INFO = Collections.emptyList();
        DEFAULT_GIFT_LIST = Collections.emptyList();
        DEFAULT_FREE_CHANCE = 0;
        DEFAULT_SCENE_ID = 0;
        DEFAULT_CURRENCY_TYPE = 0;
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
            List<PresentCategoryList> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = Message.immutableCopyOf(list);
            }
            List<PresentNumInfo> list2 = builder.num_info;
            if (list2 == null) {
                this.num_info = DEFAULT_NUM_INFO;
            } else {
                this.num_info = Message.immutableCopyOf(list2);
            }
            String str = builder.addfree_url;
            if (str == null) {
                this.addfree_url = "";
            } else {
                this.addfree_url = str;
            }
            List<PresentGiftList1> list3 = builder.gift_list;
            if (list3 == null) {
                this.gift_list = DEFAULT_GIFT_LIST;
            } else {
                this.gift_list = Message.immutableCopyOf(list3);
            }
            Integer num = builder.free_chance;
            if (num == null) {
                this.free_chance = DEFAULT_FREE_CHANCE;
            } else {
                this.free_chance = num;
            }
            Integer num2 = builder.scene_id;
            if (num2 == null) {
                this.scene_id = DEFAULT_SCENE_ID;
            } else {
                this.scene_id = num2;
            }
            Integer num3 = builder.currency_type;
            if (num3 == null) {
                this.currency_type = DEFAULT_CURRENCY_TYPE;
            } else {
                this.currency_type = num3;
            }
            this.currency_txt = builder.currency_txt;
            return;
        }
        this.list = Message.immutableCopyOf(builder.list);
        this.num_info = Message.immutableCopyOf(builder.num_info);
        this.addfree_url = builder.addfree_url;
        this.gift_list = Message.immutableCopyOf(builder.gift_list);
        this.free_chance = builder.free_chance;
        this.scene_id = builder.scene_id;
        this.currency_type = builder.currency_type;
        this.currency_txt = builder.currency_txt;
    }
}
